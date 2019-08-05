function New-ComAdobeGraniteFragsImplRandomFeatureProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${featurePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${featurePerioddescription},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${activePeriodpercentage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cookiePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cookiePeriodmaxAge}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteFragsImplRandomFeatureProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteFragsImplRandomFeatureProperties -ArgumentList @(
            ${featurePeriodname},
            ${featurePerioddescription},
            ${activePeriodpercentage},
            ${cookiePeriodname},
            ${cookiePeriodmaxAge}
        )
    }
}
