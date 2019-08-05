using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo
    /// </summary>
    public sealed class ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo:  IEquatable<ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo>
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
        public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo()
        {
        }

        private ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo(string Pid, string Title, string Description, ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder</returns>
        public static ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder Builder()
        {
            return new ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder</returns>
        public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo left, ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo left, ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties _Properties;

            internal ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfoBuilder Properties(ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo</returns>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo(
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