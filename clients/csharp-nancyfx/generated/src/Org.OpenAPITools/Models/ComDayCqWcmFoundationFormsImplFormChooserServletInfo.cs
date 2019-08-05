using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplFormChooserServletInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplFormChooserServletInfo:  IEquatable<ComDayCqWcmFoundationFormsImplFormChooserServletInfo>
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
        public ComDayCqWcmFoundationFormsImplFormChooserServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplFormChooserServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplFormChooserServletInfo()
        {
        }

        private ComDayCqWcmFoundationFormsImplFormChooserServletInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationFormsImplFormChooserServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplFormChooserServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder</returns>
        public ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationFormsImplFormChooserServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplFormChooserServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplFormChooserServletInfo left, ComDayCqWcmFoundationFormsImplFormChooserServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplFormChooserServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormChooserServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplFormChooserServletInfo left, ComDayCqWcmFoundationFormsImplFormChooserServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplFormChooserServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationFormsImplFormChooserServletProperties _Properties;

            internal ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormChooserServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationFormsImplFormChooserServletInfoBuilder Properties(ComDayCqWcmFoundationFormsImplFormChooserServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplFormChooserServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplFormChooserServletInfo</returns>
            public ComDayCqWcmFoundationFormsImplFormChooserServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplFormChooserServletInfo(
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