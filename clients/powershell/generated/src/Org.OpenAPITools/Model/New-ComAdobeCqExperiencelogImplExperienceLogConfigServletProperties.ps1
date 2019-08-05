function New-ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${disabledForGroups}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties -ArgumentList @(
            ${enabled},
            ${disabledForGroups}
        )
    }
}
