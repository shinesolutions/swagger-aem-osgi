function New-ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPerioddayPeriodcqPerioddamPeriodcorePeriodimplPeriodioPeriodSpecialFilesHandlerPeriodfilepatters}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties -ArgumentList @(
            ${comPerioddayPeriodcqPerioddamPeriodcorePeriodimplPeriodioPeriodSpecialFilesHandlerPeriodfilepatters}
        )
    }
}
