using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo
    /// </summary>
    public sealed class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo:  IEquatable<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo>
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
        public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo()
        {
        }

        private ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo(string Pid, string Title, string Description, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder</returns>
        public static ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder Builder()
        {
            return new ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder</returns>
        public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo left, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo left, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.
        /// </summary>
        public sealed class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties _Properties;

            internal ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoBuilder Properties(ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo</returns>
            public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo Build()
            {
                Validate();
                return new ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo(
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