function New-ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties -ArgumentList @(
            ${resourceTypePeriodfilters},
            ${priority}
        )
    }
}
