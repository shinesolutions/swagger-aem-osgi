function New-ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${parameterPeriodguavaPeriodcachePeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${parameterPeriodguavaPeriodcachePeriodparams},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${parameterPeriodguavaPeriodcachePeriodreload},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties -ArgumentList @(
            ${parameterPeriodguavaPeriodcachePeriodenabled},
            ${parameterPeriodguavaPeriodcachePeriodparams},
            ${parameterPeriodguavaPeriodcachePeriodreload},
            ${servicePeriodranking}
        )
    }
}
