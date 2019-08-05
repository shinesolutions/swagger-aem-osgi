function New-ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${disableSmartSync}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties -ArgumentList @(
            ${disableSmartSync}
        )
    }
}
