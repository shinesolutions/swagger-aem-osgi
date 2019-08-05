function New-ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${defaultPeriodattachmentPeriodtypePeriodblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${baselinePeriodattachmentPeriodtypePeriodblacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties -ArgumentList @(
            ${defaultPeriodattachmentPeriodtypePeriodblacklist},
            ${baselinePeriodattachmentPeriodtypePeriodblacklist}
        )
    }
}
