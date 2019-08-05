function New-ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${Feed generator algorithm}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties -ArgumentList @(
            ${Feed generator algorithm}
        )
    }
}
