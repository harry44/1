/*//Set localhost or production here
db.localhost = false

//Select the customer here (NOTE: Only one should be true)
if(db.localhost==true){

dataSource {
         pooled = true
        jmxExport = true
       // driverClassName = "org.postgresql.Driver"
    	//dialect = "org.hibernate.dialect.PostgreSQLDialect"
		
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	       // username = "postgres"
      //  password = "postgres"
		username = "root"
		password = "root"
		url= "jdbc:mysql://localhost:3306/shop"
    	//url = "jdbc:postgresql://localhost:5432/mlmt"
    //    url = "jdbc:postgresql://localhost:5432/dswp_joyrent_new"
}
}
else{
	pooled = true
	jmxExport = true
    driverClassName = "org.postgresql.Driver"
	dialect = "org.hibernate.dialect.PostgreSQLDialect"
	
///driverClassName = "com.mysql.jdbc.Driver"
//dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	   username = "yoammvccurvnob"
    password = "75992f0bbb5b28d097b815d7e691e18ef0f003f4370c4ff90098d0bed4fad995"
	//username = "root"
	//password = "root"
	//url= "jdbc:mysql://localhost:3306/shop"
	//url = "jdbc:postgresql://localhost:5432/mlmt"
   url = "postgres://yoammvccurvnob:75992f0bbb5b28d097b815d7e691e18ef0f003f4370c4ff90098d0bed4fad995@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
	//cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
	 singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
         dataSource {
//            logSql = true
//            loggingSql = true
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
           url = "postgres://yoammvccurvnob:75992f0bbb5b28d097b815d7e691e18ef0f003f4370c4ff90098d0bed4fad995@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
			//url= "jdbc:mysql://localhost:3306/shop"

        }

        println "**** DB connection mode set to - ${dataSource.dbCreate} mode ****"
    }
    test {
        dataSource {
//            logSql = true
//            loggingSql = true
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
          // url = "jdbc:postgresql://localhost:5432/mlm"
		   url= "postgres://yoammvccurvnob:75992f0bbb5b28d097b815d7e691e18ef0f003f4370c4ff90098d0bed4fad995@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
        }

        println "**** DB connection mode set to - ${dataSource.dbCreate} mode ****"
    }
    production {
        dataSource {
             dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "postgres://yoammvccurvnob:75992f0bbb5b28d097b815d7e691e18ef0f003f4370c4ff90098d0bed4fad995@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
            properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               jmxEnabled = true
               initialSize = 5
               maxActive = 50
               minIdle = 5
               maxIdle = 25
               maxWait = 10000
               maxAge = 10 * 60000
               timeBetweenEvictionRunsMillis = 5000
               minEvictableIdleTimeMillis = 60000
               validationQuery = "SELECT 1"
               validationQueryTimeout = 3
               validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = false
               jdbcInterceptors = "ConnectionState"
               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }
}
*/

dataSource {
   pooled = true
	jmxExport = true
	driverClassName = "org.postgresql.Driver"
	dialect = "org.hibernate.dialect.PostgreSQLDialect"
	
///driverClassName = "com.mysql.jdbc.Driver"
//dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	 //  username = "wcidddkndroobh"
	//password = "9108f50c1dbe7ad1754edd18b81748a7e40135267b92ff08e80db982669c3e7e"
	username = "postgres"
	password = "postgres"
	//url= "jdbc:mysql://localhost:3306/shop"
	url = "jdbc:postgresql://localhost:5432/onlineExam"
  // url = "jdbc:postgresql://wcidddkndroobh:9108f50c1dbe7ad1754edd18b81748a7e40135267b92ff08e80db982669c3e7e@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
	singleSession = true // configure OSIV singleSession mode
	flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update"
			// url = "jdbc:postgresql://wcidddkndroobh:9108f50c1dbe7ad1754edd18b81748a7e40135267b92ff08e80db982669c3e7e@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
			// driverClassName = "org.postgresql.Driver"
			// dialect = "org.hibernate.dialect.PostgreSQLDialect"
			 
			// url = "jdbc:postgresql://" + uri.host + ":" + uri.port + uri.path
			// username = "wcidddkndroobh"
			// password = "9108f50c1dbe7ad1754edd18b81748a7e40135267b92ff08e80db982669c3e7e"// url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:postgresql://wcidddkndroobh:9108f50c1dbe7ad1754edd18b81748a7e40135267b92ff08e80db982669c3e7e@ec2-23-21-227-73.compute-1.amazonaws.com:5432/dai8la611a1al1"
		   // url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			 url = "jdbc:postgres://szytpdyyngxcmc:928a11e0aac607cd2909fbb8a81ed14e4671eb6f6787239d3075a6eca0b2a7cb@ec2-50-17-236-15.compute-1.amazonaws.com:5432/dchafuj7spkn1r"
			 driverClassName = "org.postgresql.Driver"
			 dialect = "org.hibernate.dialect.PostgreSQLDialect"
			 
			// url = "jdbc:postgresql://" + uri.host + ":" + uri.port + uri.path
			 username = "szytpdyyngxcmc"
			 password = "928a11e0aac607cd2909fbb8a81ed14e4671eb6f6787239d3075a6eca0b2a7cb"
			  properties {
			   // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
			   jmxEnabled = true
			   initialSize = 5
			   maxActive = 50
			   minIdle = 5
			   maxIdle = 25
			   maxWait = 10000
			   maxAge = 10 * 60000
			   timeBetweenEvictionRunsMillis = 5000
			   minEvictableIdleTimeMillis = 60000
			   validationQuery = "SELECT 1"
			   validationQueryTimeout = 3
			   validationInterval = 15000
			   testOnBorrow = true
			   testWhileIdle = true
			   testOnReturn = false
			   jdbcInterceptors = "ConnectionState"
			   defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
			}
		}
	}
}
