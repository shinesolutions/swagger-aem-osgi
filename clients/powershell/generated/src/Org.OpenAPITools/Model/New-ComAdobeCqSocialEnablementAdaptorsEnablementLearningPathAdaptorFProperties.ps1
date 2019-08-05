function New-ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${isMemberCheck}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties -ArgumentList @(
            ${isMemberCheck}
        )
    }
}
