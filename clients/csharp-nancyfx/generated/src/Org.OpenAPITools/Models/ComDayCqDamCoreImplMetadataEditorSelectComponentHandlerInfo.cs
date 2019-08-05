using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo:  IEquatable<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo>
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
        public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo()
        {
        }

        private ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder</returns>
        public static ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder</returns>
        public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo left, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo left, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties _Properties;

            internal ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoBuilder Properties(ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo</returns>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo(
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