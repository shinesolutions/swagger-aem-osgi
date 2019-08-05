function New-ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${solrPeriodzkPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${solrPeriodcommit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cachePeriodon},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${concurrencyPeriodlevel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodstartPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodttl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties -ArgumentList @(
            ${solrPeriodzkPeriodtimeout},
            ${solrPeriodcommit},
            ${cachePeriodon},
            ${concurrencyPeriodlevel},
            ${cachePeriodstartPeriodsize},
            ${cachePeriodttl},
            ${cachePeriodsize}
        )
    }
}
