function New-ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${ttl1},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${ttl2}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties -ArgumentList @(
            ${enable},
            ${ttl1},
            ${ttl2}
        )
    }
}
