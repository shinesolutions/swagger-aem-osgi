using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo:  IEquatable<ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo>
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
        public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo()
        {
        }

        private ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder</returns>
        public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo left, ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo left, ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties _Properties;

            internal ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfoBuilder Properties(ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo</returns>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo(
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