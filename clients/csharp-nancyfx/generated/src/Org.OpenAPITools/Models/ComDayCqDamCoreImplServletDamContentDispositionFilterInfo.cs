using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletDamContentDispositionFilterInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletDamContentDispositionFilterInfo:  IEquatable<ComDayCqDamCoreImplServletDamContentDispositionFilterInfo>
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
        public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletDamContentDispositionFilterInfo()
        {
        }

        private ComDayCqDamCoreImplServletDamContentDispositionFilterInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletDamContentDispositionFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder</returns>
        public ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletDamContentDispositionFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo left, ComDayCqDamCoreImplServletDamContentDispositionFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletDamContentDispositionFilterInfo left, ComDayCqDamCoreImplServletDamContentDispositionFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletDamContentDispositionFilterProperties _Properties;

            internal ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterInfoBuilder Properties(ComDayCqDamCoreImplServletDamContentDispositionFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletDamContentDispositionFilterInfo</returns>
            public ComDayCqDamCoreImplServletDamContentDispositionFilterInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletDamContentDispositionFilterInfo(
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