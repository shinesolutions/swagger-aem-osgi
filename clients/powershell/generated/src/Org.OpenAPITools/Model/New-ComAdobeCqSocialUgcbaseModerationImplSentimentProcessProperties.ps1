function New-ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${watchwordsPeriodpositive},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${watchwordsPeriodnegative},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${watchwordsPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${sentimentPeriodpath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties -ArgumentList @(
            ${watchwordsPeriodpositive},
            ${watchwordsPeriodnegative},
            ${watchwordsPeriodpath},
            ${sentimentPeriodpath}
        )
    }
}
