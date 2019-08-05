function New-ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${mimePeriodallowEmpty},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${mimePeriodallowed}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties -ArgumentList @(
            ${mimePeriodallowEmpty},
            ${mimePeriodallowed}
        )
    }
}
