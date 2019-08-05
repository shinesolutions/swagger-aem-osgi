function New-ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteHttpcacheFileFileCacheStoreProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteHttpcacheFileFileCacheStoreProperties -ArgumentList @(
            ${comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot},
            ${comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost}
        )
    }
}
