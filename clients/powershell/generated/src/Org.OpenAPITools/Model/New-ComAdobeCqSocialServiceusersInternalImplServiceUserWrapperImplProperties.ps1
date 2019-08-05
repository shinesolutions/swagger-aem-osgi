function New-ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enableFallback}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties -ArgumentList @(
            ${enableFallback}
        )
    }
}
