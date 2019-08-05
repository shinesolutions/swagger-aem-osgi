function New-ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourceTypePeriodfilters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priority}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties -ArgumentList @(
            ${resourceTypePeriodfilters},
            ${priority}
        )
    }
}
