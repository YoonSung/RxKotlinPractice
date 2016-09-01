package practice.dagger;

import dagger.Binds;
import dagger.Module;

@Module
abstract class PumpModule {
    @Binds
    abstract Pump pump(Thermosiphon pump);    
}
