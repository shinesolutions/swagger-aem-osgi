using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventTemplatePostProcessorInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventTemplatePostProcessorInfo:  IEquatable<ComDayCqWcmCoreImplEventTemplatePostProcessorInfo>
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
        public ComDayCqWcmCoreImplEventTemplatePostProcessorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventTemplatePostProcessorInfo()
        {
        }

        private ComDayCqWcmCoreImplEventTemplatePostProcessorInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplEventTemplatePostProcessorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder</returns>
        public static ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder</returns>
        public ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplEventTemplatePostProcessorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo left, ComDayCqWcmCoreImplEventTemplatePostProcessorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventTemplatePostProcessorInfo left, ComDayCqWcmCoreImplEventTemplatePostProcessorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplEventTemplatePostProcessorProperties _Properties;

            internal ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorInfoBuilder Properties(ComDayCqWcmCoreImplEventTemplatePostProcessorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventTemplatePostProcessorInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventTemplatePostProcessorInfo</returns>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventTemplatePostProcessorInfo(
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