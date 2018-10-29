package .common.injection.component

import dagger.Component
import .common.injection.module.ApplicationTestModule
import .injection.component.AppComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationTestModule::class))
interface TestComponent : AppComponent