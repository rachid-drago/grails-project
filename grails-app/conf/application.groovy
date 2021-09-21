// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.userLookup.userDomainClassName = 'projetgrails.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'projetgrails.UserRole'
grails.plugin.springsecurity.authority.className = 'projetgrails.Role'
grails.plugin.springsecurity.requestMap.className = 'projetgrails.UserRole'

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/**',               access: ['permitAll']],
	[pattern: '/dbconsole/**', access: ['permitAll']],
	[pattern: '/saleAd/**', access: ['permitAll']],
	[pattern: '/user/**', access: ['permitAll']],
	[pattern: '/users/**', access: ['permitAll']],
	[pattern: '/illustrations/**', access: ['permitAll']],
	[pattern: '/api/**', access: ['ROLE_ADMIN']],
	[pattern: '/error',  access: ['permitAll']],
	[pattern: '/index', access: ['permitAll']],
	[pattern: '/index.gsp', access: ['permitAll']],
	[pattern: '/shutdown', access: ['permitAll']],
	[pattern: '/assets/**', access: ['permitAll']],
	[pattern: '/**/js/**', access: ['permitAll']],
	[pattern: '/**/css/**', access: ['permitAll']],
	[pattern: '/**/images/**', access: ['permitAll']],
	[pattern: '/api/**',  access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
		[pattern: '/assets/**', filters: 'none'],
		[pattern: '/**/js/**', filters: 'none'],
		[pattern: '/**/css/**', filters: 'none'],
		[pattern: '/**/images/**', filters: 'none'],
		[pattern: '/**/favicon.ico', filters: 'none'],
		[
				pattern: '/api/**',
				filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,' +
						'-authenticationProcessingFilter,-securityContextPersistenceFilter,' +
						'-rememberMeAuthenticationFilter'
		],
		[pattern: '/**', filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']
]


