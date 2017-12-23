Pod::Spec.new do |s|
  s.name = 'GraphHopper'
  s.ios.deployment_target = '8.0'
  s.osx.deployment_target = '10.9'
  s.version = '0.0.1'
  s.source = { :git => 'git@github.com:swagger-api/swagger-mustache.git', :tag => 'v1.0.0' }
  s.authors = 'Swagger Codegen'
  s.license = 'Proprietary'
  s.homepage = 'https://github.com/swagger-api/swagger-codegen'
  s.summary = 'GraphHopper Swift SDK'
  s.source_files = 'GraphHopper/Classes/Swaggers/**/*.swift'
  s.dependency 'Alamofire', '~> 3.5.1'
end
