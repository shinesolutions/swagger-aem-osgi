function New-ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${formsPeriodformparagraphpostprocessorPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${formsPeriodformparagraphpostprocessorPeriodformresourcetypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties -ArgumentList @(
            ${formsPeriodformparagraphpostprocessorPeriodenabled},
            ${formsPeriodformparagraphpostprocessorPeriodformresourcetypes}
        )
    }
}
