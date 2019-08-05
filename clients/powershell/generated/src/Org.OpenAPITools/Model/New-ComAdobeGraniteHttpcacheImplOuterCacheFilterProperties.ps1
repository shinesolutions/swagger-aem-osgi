function New-ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties -ArgumentList @(
            ${comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths}
        )
    }
}
