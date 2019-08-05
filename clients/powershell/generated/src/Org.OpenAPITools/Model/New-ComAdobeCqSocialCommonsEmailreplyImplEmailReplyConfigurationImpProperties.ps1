function New-ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${emailPeriodcreatePostFromReply},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${emailPeriodaddCommentIdTo},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${emailPeriodsubjectMaximumLength},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodreplyToAddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodreplyToDelimiter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodtrackerIdPrefixInSubject},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodtrackerIdPrefixInBody},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${emailPeriodasHTML},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPerioddefaultUserName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${emailPeriodtemplatesPeriodrootPath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties -ArgumentList @(
            ${emailPeriodname},
            ${emailPeriodcreatePostFromReply},
            ${emailPeriodaddCommentIdTo},
            ${emailPeriodsubjectMaximumLength},
            ${emailPeriodreplyToAddress},
            ${emailPeriodreplyToDelimiter},
            ${emailPeriodtrackerIdPrefixInSubject},
            ${emailPeriodtrackerIdPrefixInBody},
            ${emailPeriodasHTML},
            ${emailPerioddefaultUserName},
            ${emailPeriodtemplatesPeriodrootPath}
        )
    }
}
