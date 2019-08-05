function New-ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodpagesupdatehandlerPeriodimageresourcetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodpagesupdatehandlerPeriodproductresourcetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodpagesupdatehandlerPeriodvideoresourcetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodpagesupdatehandlerPeriodpreviewmodepaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties -ArgumentList @(
            ${cqPeriodpagesupdatehandlerPeriodimageresourcetypes},
            ${cqPeriodpagesupdatehandlerPeriodproductresourcetypes},
            ${cqPeriodpagesupdatehandlerPeriodvideoresourcetypes},
            ${cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes},
            ${cqPeriodpagesupdatehandlerPeriodpreviewmodepaths}
        )
    }
}
