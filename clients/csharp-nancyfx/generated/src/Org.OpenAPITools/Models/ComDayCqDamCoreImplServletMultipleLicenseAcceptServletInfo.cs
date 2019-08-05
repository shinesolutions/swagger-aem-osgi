using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo:  IEquatable<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo>
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
        public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo left, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo left, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties _Properties;

            internal ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoBuilder Properties(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo</returns>
            public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo(
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