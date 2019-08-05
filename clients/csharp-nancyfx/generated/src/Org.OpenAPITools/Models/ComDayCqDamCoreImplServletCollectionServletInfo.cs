using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCollectionServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCollectionServletInfo:  IEquatable<ComDayCqDamCoreImplServletCollectionServletInfo>
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
        public ComDayCqDamCoreImplServletCollectionServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCollectionServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCollectionServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletCollectionServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletCollectionServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCollectionServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletCollectionServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCollectionServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCollectionServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletCollectionServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletCollectionServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCollectionServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCollectionServletInfo left, ComDayCqDamCoreImplServletCollectionServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCollectionServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCollectionServletInfo left, ComDayCqDamCoreImplServletCollectionServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCollectionServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCollectionServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletCollectionServletProperties _Properties;

            internal ComDayCqDamCoreImplServletCollectionServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletCollectionServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletCollectionServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletCollectionServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletCollectionServletInfoBuilder Properties(ComDayCqDamCoreImplServletCollectionServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCollectionServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCollectionServletInfo</returns>
            public ComDayCqDamCoreImplServletCollectionServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCollectionServletInfo(
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