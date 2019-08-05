using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsReferenceSearchServletInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsReferenceSearchServletInfo:  IEquatable<ComDayCqWcmCoreImplServletsReferenceSearchServletInfo>
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
        public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsReferenceSearchServletInfo()
        {
        }

        private ComDayCqWcmCoreImplServletsReferenceSearchServletInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplServletsReferenceSearchServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder</returns>
        public static ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder</returns>
        public ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplServletsReferenceSearchServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo left, ComDayCqWcmCoreImplServletsReferenceSearchServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsReferenceSearchServletInfo left, ComDayCqWcmCoreImplServletsReferenceSearchServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplServletsReferenceSearchServletProperties _Properties;

            internal ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletInfoBuilder Properties(ComDayCqWcmCoreImplServletsReferenceSearchServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsReferenceSearchServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsReferenceSearchServletInfo</returns>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsReferenceSearchServletInfo(
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