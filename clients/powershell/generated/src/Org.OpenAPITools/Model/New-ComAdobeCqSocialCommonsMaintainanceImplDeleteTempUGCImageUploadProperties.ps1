function New-ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${numberOfDays},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${ageOfFile}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties -ArgumentList @(
            ${numberOfDays},
            ${ageOfFile}
        )
    }
}
