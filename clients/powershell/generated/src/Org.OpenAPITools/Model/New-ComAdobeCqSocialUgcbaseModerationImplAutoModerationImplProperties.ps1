function New-ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${automoderationPeriodsequence},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${automoderationPeriodonfailurestop}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties -ArgumentList @(
            ${automoderationPeriodsequence},
            ${automoderationPeriodonfailurestop}
        )
    }
}
