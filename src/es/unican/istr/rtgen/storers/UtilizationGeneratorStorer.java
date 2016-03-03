package es.unican.istr.rtgen.storers;

import es.unican.istr.rtgen.Storer;
import es.unican.istr.rtgen.storers.config.StorerConfig;
import es.unican.istr.rtgen.system.config.SystemConfig;
import es.unican.istr.rtgen.tool.config.ToolConfig;

/**
 * Created by Juan M Rivas (jmrivasconcepcion@gmail.com) on 17/01/2016.
 */
public abstract class UtilizationGeneratorStorer extends Storer {

    //////////////////
    // Constructors //
    //////////////////

    public UtilizationGeneratorStorer(StorerConfig config){
        super(config);
    }


    /////////////////////////////
    // Results Storage Methods //
    /////////////////////////////

    public abstract void storeSeriesResults(
            SystemConfig sysConfig, ToolConfig toolConfig,
            Integer utilizationStart, Integer utilizationTop, Integer utilizationStep,
            Integer maximumSchedulableUtilization, Long timeElapsed);
}
