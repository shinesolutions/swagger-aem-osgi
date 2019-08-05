function New-ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${size}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties -ArgumentList @(
            ${size}
        )
    }
}
