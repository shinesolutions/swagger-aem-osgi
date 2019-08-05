function New-ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${keypairPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${keypairPeriodalias},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cdnrewriterPeriodattributes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cdnPeriodrewriterPerioddistributionPerioddomain}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties -ArgumentList @(
            ${servicePeriodranking},
            ${keypairPeriodid},
            ${keypairPeriodalias},
            ${cdnrewriterPeriodattributes},
            ${cdnPeriodrewriterPerioddistributionPerioddomain}
        )
    }
}
