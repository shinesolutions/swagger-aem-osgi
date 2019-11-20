using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplMailServletInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplMailServletInfo:  IEquatable<ComDayCqWcmFoundationFormsImplMailServletInfo>
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
        public ComDayCqWcmFoundationFormsImplMailServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplMailServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplMailServletInfo()
        {
        }

        private ComDayCqWcmFoundationFormsImplMailServletInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationFormsImplMailServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplMailServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplMailServletInfoBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplMailServletInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplMailServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplMailServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplMailServletInfoBuilder</returns>
        public ComDayCqWcmFoundationFormsImplMailServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationFormsImplMailServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplMailServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplMailServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplMailServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplMailServletInfo left, ComDayCqWcmFoundationFormsImplMailServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplMailServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplMailServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplMailServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplMailServletInfo left, ComDayCqWcmFoundationFormsImplMailServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplMailServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplMailServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationFormsImplMailServletProperties _Properties;

            internal ComDayCqWcmFoundationFormsImplMailServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationFormsImplMailServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationFormsImplMailServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationFormsImplMailServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationFormsImplMailServletInfoBuilder Properties(ComDayCqWcmFoundationFormsImplMailServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplMailServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplMailServletInfo</returns>
            public ComDayCqWcmFoundationFormsImplMailServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplMailServletInfo(
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