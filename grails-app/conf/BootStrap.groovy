import org.example.SecRole
import org.example.SecUser
import org.example.SecUserSecRole

class BootStrap {

    def init = { servletContext ->
		println "bootsrtap start--"
		println "<-- Bootstrap start --->"
		def user=SecUser.findByUsername('admin')
		if(user==null){
			user=new SecUser(username:'admin',password:'admin')
			user.save(flush:true)
			def secRole=new SecRole(user:user,authority:'ROLE_ADMIN')
			def secRole1=new SecRole(user:user,authority:'ROLE_TENANT_ADMIN')
			def secRole2=new SecRole(user:user,authority:'ROLE_USER')
			secRole.save(flush:true)
			secRole1.save(flush:true)
			secRole2.save(flush:true)
			SecUserSecRole.create(user,secRole, true)
		
		}
    }
    def destroy = {
		println "bootsratp end ----"
    }
}
