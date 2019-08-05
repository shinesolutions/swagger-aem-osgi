function New-ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cdnPeriodconfigPerioddistributionPerioddomain},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cdnPeriodconfigPeriodenablePeriodrewriting},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cdnPeriodconfigPeriodpathPeriodprefixes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cdnPeriodconfigPeriodcdnttl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cdnPeriodconfigPeriodapplicationPeriodprotocol}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties -ArgumentList @(
            ${cdnPeriodconfigPerioddistributionPerioddomain},
            ${cdnPeriodconfigPeriodenablePeriodrewriting},
            ${cdnPeriodconfigPeriodpathPeriodprefixes},
            ${cdnPeriodconfigPeriodcdnttl},
            ${cdnPeriodconfigPeriodapplicationPeriodprotocol}
        )
    }
}
