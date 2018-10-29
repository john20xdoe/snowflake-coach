package .injection.component

import android.app.Application
import android.content.Context
import dagger.Component
import .data.DataManager
import .data.remote.PokemonApi
import .injection.ApplicationContext
import .injection.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun pokemonApi(): PokemonApi
}
