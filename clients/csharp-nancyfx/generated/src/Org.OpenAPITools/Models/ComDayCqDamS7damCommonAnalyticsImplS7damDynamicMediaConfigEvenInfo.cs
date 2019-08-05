using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo:  IEquatable<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo>
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
        public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo()
        {
        }

        private ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder</returns>
        public static ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder</returns>
        public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo left, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo left, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties _Properties;

            internal ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoBuilder Properties(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo</returns>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo(
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