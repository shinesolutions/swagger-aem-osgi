function New-ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enableDataTriggeredContent}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties -ArgumentList @(
            ${enableDataTriggeredContent}
        )
    }
}
