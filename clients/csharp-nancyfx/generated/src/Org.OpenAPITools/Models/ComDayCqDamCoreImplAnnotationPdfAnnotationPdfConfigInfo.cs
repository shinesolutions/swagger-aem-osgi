using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo:  IEquatable<ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo>
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
        public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo()
        {
        }

        private ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder</returns>
        public static ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder</returns>
        public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo left, ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo left, ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties _Properties;

            internal ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoBuilder Properties(ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo</returns>
            public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo(
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