function New-ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${effectiveBundleListPath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties -ArgumentList @(
            ${effectiveBundleListPath}
        )
    }
}
