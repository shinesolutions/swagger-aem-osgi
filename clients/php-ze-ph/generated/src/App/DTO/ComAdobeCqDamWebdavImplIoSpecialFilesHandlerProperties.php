<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties
{
    /**
     * @DTA\Data(field="com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $com_day_cq_dam_core_impl_io_special_files_handler_filepatters;
}
