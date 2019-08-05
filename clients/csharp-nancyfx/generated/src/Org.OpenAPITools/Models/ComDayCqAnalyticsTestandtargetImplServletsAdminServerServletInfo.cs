using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo:  IEquatable<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo>
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
        public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo(string Pid, string Title, string Description, ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder With()
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

        public bool Equals(ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo left, ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo left, ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties _Properties;

            internal ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoBuilder Properties(ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo</returns>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo(
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