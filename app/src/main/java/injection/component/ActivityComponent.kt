package .injection.component

import .injection.PerActivity
import .injection.module.ActivityModule
import .features.base.BaseActivity
import .features.detail.DetailActivity
import .features.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}
