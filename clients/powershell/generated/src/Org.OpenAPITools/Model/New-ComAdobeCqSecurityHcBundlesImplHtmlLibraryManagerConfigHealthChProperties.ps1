function New-ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties -ArgumentList @(
            ${hcPeriodtags}
        )
    }
}
