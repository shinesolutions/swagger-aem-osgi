function New-ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priority}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties -ArgumentList @(
            ${priority}
        )
    }
}
