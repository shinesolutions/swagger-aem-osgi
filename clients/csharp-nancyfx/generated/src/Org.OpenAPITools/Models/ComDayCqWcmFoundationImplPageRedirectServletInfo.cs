using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplPageRedirectServletInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplPageRedirectServletInfo:  IEquatable<ComDayCqWcmFoundationImplPageRedirectServletInfo>
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
        public ComDayCqWcmFoundationImplPageRedirectServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplPageRedirectServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplPageRedirectServletInfo()
        {
        }

        private ComDayCqWcmFoundationImplPageRedirectServletInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationImplPageRedirectServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplPageRedirectServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder</returns>
        public static ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder</returns>
        public ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationImplPageRedirectServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplPageRedirectServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageRedirectServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageRedirectServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplPageRedirectServletInfo left, ComDayCqWcmFoundationImplPageRedirectServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplPageRedirectServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageRedirectServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageRedirectServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplPageRedirectServletInfo left, ComDayCqWcmFoundationImplPageRedirectServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplPageRedirectServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationImplPageRedirectServletProperties _Properties;

            internal ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageRedirectServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageRedirectServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageRedirectServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageRedirectServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationImplPageRedirectServletInfoBuilder Properties(ComDayCqWcmFoundationImplPageRedirectServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplPageRedirectServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplPageRedirectServletInfo</returns>
            public ComDayCqWcmFoundationImplPageRedirectServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplPageRedirectServletInfo(
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