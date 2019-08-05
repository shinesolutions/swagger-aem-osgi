using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo:  IEquatable<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo()
        {
        }

        private ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder</returns>
        public static ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder</returns>
        public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo left, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo left, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties _Properties;

            internal ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoBuilder Properties(ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo</returns>
            public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}