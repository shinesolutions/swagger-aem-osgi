function New-ComAdobeCqCdnRewriterImplCDNRewriterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cdnrewriterPeriodattributes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cdnPeriodrewriterPerioddistributionPerioddomain}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCdnRewriterImplCDNRewriterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCdnRewriterImplCDNRewriterProperties -ArgumentList @(
            ${servicePeriodranking},
            ${cdnrewriterPeriodattributes},
            ${cdnPeriodrewriterPerioddistributionPerioddomain}
        )
    }
}
